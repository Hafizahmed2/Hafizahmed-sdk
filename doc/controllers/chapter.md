# Chapter

```java
Chapter chapter = client.getChapter();
```

## Class Name

`Chapter`

## Methods

* [Chapter by Id](../../doc/controllers/chapter.md#chapter-by-id)
* [All Chapters](../../doc/controllers/chapter.md#all-chapters)


# Chapter by Id

Request one specific chapter

```java
CompletableFuture<ChapterResponse> chapterByIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the chapter |

## Response Type

[`ChapterResponse`](../../doc/models/chapter-response.md)

## Example Usage

```java
String id = "id0";

chapter.chapterByIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# All Chapters

Returns List of all "The Lord of the Rings" chapters

```java
CompletableFuture<ChapterResponse> allChaptersAsync()
```

## Response Type

[`ChapterResponse`](../../doc/models/chapter-response.md)

## Example Usage

```java
chapter.allChaptersAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

