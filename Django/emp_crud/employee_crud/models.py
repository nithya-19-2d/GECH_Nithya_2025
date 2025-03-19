from django.db import models

# Create your models here.
class Student(models.Model):
    name = models.CharField(blank=False, max_length=200)
    email = models.EmailField(blank=False)
    designation = models.CharField(blank=False, max_length=200)
    salary = models.CharField(blank=False, max_length=200)
