from django.shortcuts import render
from .import models, forms

# Create your views here.
def home(request):
    if request.method == "POST":
        std_form = forms.StudentForm(request.POST)
    students = models.Student.objects.all()
    context={students:students}
    student_form = forms.StudentForm()
    context = {
        "students":students,
        "student_form":student_form
    }    
    return render(request, "home.html", context) 
