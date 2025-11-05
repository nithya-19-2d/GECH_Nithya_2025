package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootfirstappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =	SpringApplication.run(SpringbootfirstappApplication.class, args);
//		Object bean = run.getBean("customer1"); // without defining the bean name , we use in getbaean() = > its throws a exception like , nosuchbeandefination
//		Custumer c1 = (Custumer) bean; // bean type is Object , so casting the bean to Customer type , we use type casting(upcasting)
//		System.out.println(c1.name); // i commentedd because as already i return in the Customer class
//		System.out.println(c1.age);
//		
//		Custumer c2	= (Custumer) run.getBean("customer2");
//		System.out.println(c2);
		
		Custumer bean2 =run.getBean(Custumer.class); //if ioc contain only one bean per particular class , then we use this , if we use this for multiple beans for particular class , its shows the ambiguity exception like tis
		System.out.println(bean2);                    //No qualifying bean of type 'com.example.demo.Custumer' available: expected single matching bean but found 3: customer1,customer2,customer3 (NoUniqueBeanDefinitionException)
		
		Car car = (Car) run.getBean("car");   //here "car" is a object name , if not give the name in @component
		System.out.println(car);
		car.name = "MG";
		System.out.println(car.name);
		System.out.println(car.no_car);
		
		//Student s1 = Student run.getBean("student"); // if we want to write like this, we have import the student class from hello package so thats why , the Component class will used within the base class only.
		
		
		
	
		
		
	}

}
