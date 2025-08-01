package Thinker41.Thinker41.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import Thinker41.Thinker41.model.Product;

@Service
public class ProductService {
    private final Product product = loadProduct(); // load static data or from DB

    public Map<String, Object> validateAndCalculate(Map<String, String> selectedChoices) {
        for (Rule rule : product.getRules()) {
            String selected = selectedChoices.getOrDefault(getCategory(rule.getIfChoice()), "");
            if (rule.getIfChoice().equals(selected)) {
                if (rule.getThenRequired() != null && !selectedChoices.containsValue(rule.getThenRequired())) {
                    return Map.of("status", "error", "message", rule.getIfChoice() + " requires " + rule.getThenRequired());
                }
                if (rule.getIncompatibleWith() != null && selectedChoices.containsValue(rule.getIncompatibleWith())) {
                    return Map.of("status", "error", "message", rule.getIncompatibleWith() + " is incompatible with " + rule.getIfChoice());
                }
            }
        }

        int total = product.getBasePrice();
        for (Category cat : product.getCategories()) {
            String selected = selectedChoices.get(cat.getName());
            for (Choice c : cat.getChoices()) {
                if (c.getName().equals(selected)) {
                    total += c.getPriceDelta();
                }
            }
        }

        return Map.of("status", "success", "totalPrice", total);
    }

    private String getCategory(String choice) {
        for (Category cat : product.getCategories()) {
            for (Choice c : cat.getChoices()) {
                if (c.getName().equals(choice)) return cat.getName();
            }
        }
        return "";
    }

    private Product loadProduct() {
        // You can load this from DB or file
        // For now, hardcoding Laptop X with CPU, RAM, GPU, etc.
        // Include rules: Intel i7 requires "Intel Motherboard", AMD Radeon incompatible with Intel i7
        return ProductFactory.createSampleProduct();
    }
}

