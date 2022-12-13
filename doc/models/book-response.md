
# Book Response

## Structure

`BookResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Docs` | [`List<BookDoc>`](../../doc/models/book-doc.md) | Required | - | List<BookDoc> getDocs() | setDocs(List<BookDoc> docs) |
| `Total` | `int` | Required | - | int getTotal() | setTotal(int total) |
| `Limit` | `int` | Required | - | int getLimit() | setLimit(int limit) |
| `Offset` | `int` | Required | - | int getOffset() | setOffset(int offset) |
| `Page` | `int` | Required | - | int getPage() | setPage(int page) |
| `Pages` | `int` | Required | - | int getPages() | setPages(int pages) |

## Example (as JSON)

```json
{
  "docs": [
    {
      "_id": "5cf5805fb53e011a64671582",
      "name": "The Fellowship Of The Ring"
    },
    {
      "_id": "5cf58077b53e011a64671583",
      "name": "The Two Towers"
    },
    {
      "_id": "5cf58080b53e011a64671584",
      "name": "The Return Of The King"
    }
  ],
  "total": 3,
  "limit": 1000,
  "offset": 0,
  "page": 1,
  "pages": 1
}
```

