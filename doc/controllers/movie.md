# Movie

```java
Movie movie = client.getMovie();
```

## Class Name

`Movie`

## Methods

* [All Movies](../../doc/controllers/movie.md#all-movies)
* [Movie by Id](../../doc/controllers/movie.md#movie-by-id)
* [Quotes by Movie Id](../../doc/controllers/movie.md#quotes-by-movie-id)


# All Movies

Returns List of all "The Lord of the Rings" movies

```java
CompletableFuture<MovieResponse> allMoviesAsync()
```

## Response Type

[`MovieResponse`](../../doc/models/movie-response.md)

## Example Usage

```java
movie.allMoviesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Movie by Id

Request one specific movie

```java
CompletableFuture<MovieResponse> movieByIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the movie |

## Response Type

[`MovieResponse`](../../doc/models/movie-response.md)

## Example Usage

```java
String id = "id0";

movie.movieByIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Quotes by Movie Id

Request all movie quotes for one specific character

```java
CompletableFuture<QuoteResponse> quotesByMovieIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the movie |

## Response Type

[`QuoteResponse`](../../doc/models/quote-response.md)

## Example Usage

```java
String id = "id0";

movie.quotesByMovieIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

