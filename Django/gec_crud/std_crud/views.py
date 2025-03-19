from django.shortcuts import render
from .import models, forms

# Create your views here.
# //to create function in python =>def (keyword)

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

# to add the models to the html template we use the context
# have to link this views in url

def about(request):
    return render(request, "about.html") 



