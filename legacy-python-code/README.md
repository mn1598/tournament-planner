# Setup Project

### Setup env
To create your env execute 
```bash
python -m venv venv
```
To activate your virtual env execute
```bash
venv\Scripts\activate
```
To deactivate your virtual env execute
```bash
deactivate
```
### Install Requirements
To install the necessary packages execute
```bash
pip install -r requirements.txt
```

### Set up database
Load fixtures
```bash
python manage.py loaddata fixtures_user.json
```

### Run application 
```bash
py manage.py runserver
```