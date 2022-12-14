
# Chapter Response

## Structure

`ChapterResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Docs` | [`List<ChapterDoc>`](../../doc/models/chapter-doc.md) | Required | - | List<ChapterDoc> getDocs() | setDocs(List<ChapterDoc> docs) |
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
      "_id": "6091b6d6d58360f988133ba1",
      "chapterName": "The Departure of Boromir"
    },
    {
      "_id": "6091b6d6d58360f988133ba2",
      "chapterName": "The Riders of Rohan"
    },
    {
      "_id": "6091b6d6d58360f988133ba3",
      "chapterName": "The Uruk-Hai"
    },
    {
      "_id": "6091b6d6d58360f988133ba4",
      "chapterName": "Treebeard"
    },
    {
      "_id": "6091b6d6d58360f988133ba5",
      "chapterName": "The White Rider"
    },
    {
      "_id": "6091b6d6d58360f988133ba6",
      "chapterName": "The King of the Golden Hall"
    },
    {
      "_id": "6091b6d6d58360f988133ba7",
      "chapterName": "Helm's Deep"
    },
    {
      "_id": "6091b6d6d58360f988133ba8",
      "chapterName": "The Road to Isengard"
    },
    {
      "_id": "6091b6d6d58360f988133ba9",
      "chapterName": "Flotsam and Jetsam"
    },
    {
      "_id": "6091b6d6d58360f988133baa",
      "chapterName": "The Voice of Saruman"
    },
    {
      "_id": "6091b6d6d58360f988133bab",
      "chapterName": "The Palantir"
    },
    {
      "_id": "6091b6d6d58360f988133bac",
      "chapterName": "The Taming of Smeagol"
    },
    {
      "_id": "6091b6d6d58360f988133bad",
      "chapterName": "The Passage of the Marshes"
    },
    {
      "_id": "6091b6d6d58360f988133bae",
      "chapterName": "The Black Gate is Closed"
    },
    {
      "_id": "6091b6d6d58360f988133baf",
      "chapterName": "Of Herbs and Stewed Rabbit"
    },
    {
      "_id": "6091b6d6d58360f988133bb0",
      "chapterName": "The Window on the West"
    },
    {
      "_id": "6091b6d6d58360f988133bb1",
      "chapterName": "The Forbidden Pool"
    },
    {
      "_id": "6091b6d6d58360f988133bb2",
      "chapterName": "Journey to the Cross-roads"
    },
    {
      "_id": "6091b6d6d58360f988133bb3",
      "chapterName": "The Stairs of Cirith Ungol"
    },
    {
      "_id": "6091b6d6d58360f988133bb4",
      "chapterName": "Shelob's Lair"
    },
    {
      "_id": "6091b6d6d58360f988133bb5",
      "chapterName": "The Choices of Master Samwise"
    }
  ],
  "total": 21,
  "limit": 1000,
  "offset": 0,
  "page": 1,
  "pages": 1
}
```

