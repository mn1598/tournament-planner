from .repository import TeamRepository


class TeamService(object):
    def __init__(self):
        self.team_repository = TeamRepository()

    def get_all_teams(self):
        return self.team_repository.get_all_teams()

    def get_team_by_name(self, name):
        return self.team_repository.get_team_by_name(name)

    def create_new_team(self, name):
        return self.team_repository.create_new_team(name)
