from .models import Team


class TeamRepository:

    def __int__(self):
        pass

    def get_all_teams(self):
        return Team.objects.all()

    def get_team_by_name(self, name):
        return Team.objects.get(name=name)

    def create_new_team(self, name):
        team = Team(name=name)
        return team.save()
