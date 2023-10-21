from django.http import HttpResponse, JsonResponse
from rest_framework.decorators import api_view
from rest_framework.response import Response

from .serializer import TeamSerializer
from .service import TeamService


@api_view(['GET'])
def index(request):
    """
    Documentation of the first view
    """
    return HttpResponse("Hello World, this is the first match view")


@api_view(['GET'])
def get_all_teams(request):
    team_service = TeamService()
    teams = team_service.get_all_teams()

    result = []
    for team in teams:
        result.append(TeamSerializer(team).data)

    return JsonResponse({"status": "success", "data": result}, status=200)


@api_view(['GET', 'POST'])
def get_or_create_team_by_name(request, name):
    if request.method == 'GET':
        return Response({"status": "success", "data": get_team_by_name(name)}, status=200)
    elif request.method == 'POST':
        create_team_by_name(name)  # todo request handling
        return Response({"status": "success", "data": "Team {} created".format(name)}, status=201)


def get_team_by_name(name):
    team_service = TeamService()
    result = TeamSerializer(team_service.get_team_by_name(name)).data
    print(type(result))
    return result


def create_team_by_name(name):
    team_service = TeamService()
    return team_service.create_new_team(name)
