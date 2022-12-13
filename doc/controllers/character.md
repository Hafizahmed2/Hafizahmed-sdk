# Character

```java
MCharacter mCharacter = client.getMCharacter();
```

## Class Name

`MCharacter`

## Methods

* [Quotes by Character Id](../../doc/controllers/character.md#quotes-by-character-id)
* [All Characters](../../doc/controllers/character.md#all-characters)
* [Character by Id](../../doc/controllers/character.md#character-by-id)


# Quotes by Character Id

Request all movie quotes for one specific character

```java
CompletableFuture<QuoteResponse> quotesByCharacterIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the character |

## Response Type

[`QuoteResponse`](../../doc/models/quote-response.md)

## Example Usage

```java
String id = "id0";

mCharacter.quotesByCharacterIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# All Characters

Returns List of all "The Lord of the Rings" characters

```java
CompletableFuture<CharacterResponse> allCharactersAsync()
```

## Response Type

[`CharacterResponse`](../../doc/models/character-response.md)

## Example Usage

```java
mCharacter.allCharactersAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Character by Id

Request one specific character

```java
CompletableFuture<CharacterResponse> characterByIdAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Id of the character |

## Response Type

[`CharacterResponse`](../../doc/models/character-response.md)

## Example Usage

```java
String id = "id0";

mCharacter.characterByIdAsync(id).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

