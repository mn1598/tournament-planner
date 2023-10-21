from django.urls import path

from . import views

urlpatterns = [
    path("", views.index, name="index"),
    path("team/", views.get_all_teams, name="getTeams"),
    path("team/<str:name>/", views.get_or_create_team_by_name, name="team")
]