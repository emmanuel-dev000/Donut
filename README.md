# Donut-API
Springboot project based on donuts

https://donut-api-production.up.railway.app/donut
Show all donuts.

https://donut-api-production.up.railway.app/
Adding a new donut to database
Set body to raw and application/json
e.g:
{
    "id": "SampleDonut",
    "name": "Sample Donut"
}

https://donut-api-production.up.railway.app/donut/{id}
This updates the donut's name.
Change {id} to the donut's id to be updated.
Set body to raw and application/json
e.g:
https://donut-api-production.up.railway.app/donut/SampleDonut
{
    "id": "TemptingDonut",
    "name": "Tempting Donut"
}
