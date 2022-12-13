# Book

```java
Book book = client.getBook();
```

## Class Name

`Book`

## Methods

* [All Books](../../doc/controllers/book.md#all-books)
* [Book by Id](../../doc/controllers/book.md#book-by-id)
* [Chapters by Book Id](../../doc/controllers/book.md#chapters-by-book-id)


# All Books

Returns List of all "The Lord of the Rings" books

```java
CompletableFuture<BookResponse> allBooksAsync()
```

## Response Type

[`BookResponse`](../../doc/models/book-response.md)

## Example Usage

```java
book.allBooksAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Book by Id

Request one specific book

```java
CompletableFuture<BookResponse> bookByIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the book |

## Response Type

[`BookResponse`](../../doc/models/book-response.md)

## Example Usage

```java
String id = "id0";

book.bookByIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Chapters by Book Id

Request all chapters of one specific book

```java
CompletableFuture<ChapterResponse> chaptersByBookIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the book |

## Response Type

[`ChapterResponse`](../../doc/models/chapter-response.md)

## Example Usage

```java
String id = "id0";

book.chaptersByBookIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

