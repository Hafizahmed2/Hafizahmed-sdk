# Quote

```java
Quote quote = client.getQuote();
```

## Class Name

`Quote`

## Methods

* [All Quotes](../../doc/controllers/quote.md#all-quotes)
* [Quote by Id](../../doc/controllers/quote.md#quote-by-id)


# All Quotes

Returns List of all "The Lord of the Rings" quotes

```java
CompletableFuture<QuoteResponse> allQuotesAsync()
```

## Response Type

[`QuoteResponse`](../../doc/models/quote-response.md)

## Example Usage

```java
quote.allQuotesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Quote by Id

Request one specific quote

```java
CompletableFuture<QuoteResponse> quoteByIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the quote |

## Response Type

[`QuoteResponse`](../../doc/models/quote-response.md)

## Example Usage

```java
String id = "id0";

quote.quoteByIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

