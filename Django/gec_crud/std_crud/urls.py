from django.urls import path
from.import views
# . is the current working directory

urlpatterns = [
    path("",views.home,name="home"),
    path("about",views.about)
]
