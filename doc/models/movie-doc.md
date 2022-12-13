
# Movie Doc

## Structure

`MovieDoc`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `RuntimeInMinutes` | `int` | Required | - | int getRuntimeInMinutes() | setRuntimeInMinutes(int runtimeInMinutes) |
| `BudgetInMillions` | `int` | Required | - | int getBudgetInMillions() | setBudgetInMillions(int budgetInMillions) |
| `BoxOfficeRevenueInMillions` | `Object` | Required | - | Object getBoxOfficeRevenueInMillions() | setBoxOfficeRevenueInMillions(Object boxOfficeRevenueInMillions) |
| `AcademyAwardNominations` | `int` | Required | - | int getAcademyAwardNominations() | setAcademyAwardNominations(int academyAwardNominations) |
| `AcademyAwardWins` | `int` | Required | - | int getAcademyAwardWins() | setAcademyAwardWins(int academyAwardWins) |
| `RottenTomatoesScore` | `Object` | Required | - | Object getRottenTomatoesScore() | setRottenTomatoesScore(Object rottenTomatoesScore) |

## Example (as JSON)

```json
{
  "_id": "5cd95395de30eff6ebccde56",
  "name": "The Lord of the Rings Series",
  "runtimeInMinutes": 558,
  "budgetInMillions": 281,
  "boxOfficeRevenueInMillions": 2917,
  "academyAwardNominations": 30,
  "academyAwardWins": 17,
  "rottenTomatoesScore": 94
}
```

