
# Movie Response

## Structure

`MovieResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Docs` | [`List<MovieDoc>`](../../doc/models/movie-doc.md) | Required | - | List<MovieDoc> getDocs() | setDocs(List<MovieDoc> docs) |
| `Total` | `int` | Required | - | int getTotal() | setTotal(int total) |
| `Limit` | `int` | Required | - | int getLimit() | setLimit(int limit) |
| `Offset` | `int` | Required | - | int getOffset() | setOffset(int offset) |
| `Page` | `int` | Required | - | int getPage() | setPage(int page) |
| `Pages` | `int` | Required | - | int getPages() | setPages(int pages) |

## Example (as JSON)

```json
{
  "docs": {
    "_id": "5cd95395de30eff6ebccde56",
    "name": "The Lord of the Rings Series",
    "runtimeInMinutes": 558,
    "budgetInMillions": 281,
    "boxOfficeRevenueInMillions": 2917,
    "academyAwardNominations": 30,
    "academyAwardWins": 17,
    "rottenTomatoesScore": 94
  },
  "total": 8,
  "limit": 1000,
  "offset": 0,
  "page": 1,
  "pages": 1
}
```

