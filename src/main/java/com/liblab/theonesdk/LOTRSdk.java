package com.liblab.theonesdk;

import com.liblab.theonesdk.controllers.BookService;
import com.liblab.theonesdk.controllers.CharacterService;
import com.liblab.theonesdk.exceptions.ApiException;
import com.liblab.theonesdk.model.*;
import io.apimatic.core.utilities.CoreHelper;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is a Helper class with commonly used utilities for the SDK.
 */
public class LOTRSdk extends CoreHelper {

    private LOTRClient lotrClient;

    public LOTRSdk() {
        this.lotrClient = new LOTRClient.Builder().build();
    }

    public List<String> getAllBooks() throws ApiException, IOException {
        BookResponse bookResponse = lotrClient.getBookService().allBooks();
        return bookResponse.getDocs().stream().map(bookDoc -> bookDoc.getName()).collect(Collectors.toList());
    }

    public List<String> getAllCharacters() throws ApiException, IOException {
        CharacterResponse characterResponse = lotrClient.getCharacterService().allCharacters();
        return characterResponse.getDocs().stream().map(characterDoc -> characterDoc.getName()).collect(Collectors.toList());
    }

    public List<QuoteDoc> getQuotesByCharacter(String name) throws ApiException, IOException {
        CharacterService characterService = lotrClient.getCharacterService();
        CharacterResponse characterResponse = characterService.allCharacters();
        CharacterDoc specificCharacter = characterResponse.getDocs().stream().filter(characterDoc -> characterDoc.getName().equals(name)).findFirst().get();

        QuoteResponse quoteResponse = characterService.quotesByCharacterId(specificCharacter.getId());
        return quoteResponse.getDocs();
    }

    public List<ChapterDoc> getChaptersByBook(String bookName) throws ApiException, IOException {
        BookService bookService = lotrClient.getBookService();
        BookResponse bookResponse = bookService.allBooks();
        BookDoc specificBook = bookResponse.getDocs().stream().filter(bookDoc -> bookDoc.getName().equals(bookName)).findFirst().get();

        ChapterResponse chapterResponse = bookService.chaptersByBookId(specificBook.getId());
        return chapterResponse.getDocs();
    }
}