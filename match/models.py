from djongo import models


# Create your models here.


class Team(models.Model):
    _id = models.ObjectIdField(primary_key=True)
    name = models.CharField(max_length=30)

    class Meta:
        db_table = 'team'

    def __str__(self):
        return self.name


class Match(models.Model):
    name = models.CharField(max_length=30)
    home_team = models.ForeignKey(Team, on_delete=models.CASCADE, related_name="home_team")
    away_team = models.ForeignKey(Team, on_delete=models.CASCADE, related_name="away_team")
    date = models.DateField

    location = models.CharField(max_length=30)
