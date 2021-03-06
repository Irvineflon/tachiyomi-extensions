package eu.kanade.tachiyomi.extension.all.mangadex

/**
 * Mangadex languages
 */

class MangaDexPolish : Mangadex("pl", "pl", 3)
class MangaDexItalian : Mangadex("it", "it", 6)
class MangaDexRussian : Mangadex("ru", "ru", 7)
class MangaDexGerman : Mangadex("de", "de", 8)
class MangaDexFrench : Mangadex("fr", "fr", 10)
class MangaDexVietnamese : Mangadex("vi", "vn", 12)
class MangaDexSpanishSpain : Mangadex("es", "es", 15)
class MangaDexPortuguese : Mangadex("pt", "br", 16)
class MangaDexSwedish : Mangadex("sv", "se", 18)
class MangaDexTurkish : Mangadex("tr", "tr", 26)
class MangaDexIndonesian : Mangadex("id", "id", 27)
class MangaDexSpanishLTAM : Mangadex("es-419", "mx", 29)
class MangaDexCatalan : Mangadex("ca", "ct", 33)
class MangaDexHungarian : Mangadex("hu", "hu", 9)
class MangaDexBulgarian : Mangadex("bg", "bg", 14)
class MangaDexFilipino : Mangadex("fil", "ph", 34)

fun getAllMangaDexLanguages() = listOf(
        MangaDexEnglish(),
        MangaDexPolish(),
        MangaDexItalian(),
        MangaDexRussian(),
        MangaDexGerman(),
        MangaDexFrench(),
        MangaDexVietnamese(),
        MangaDexSpanishSpain(),
        MangaDexPortuguese(),
        MangaDexSwedish(),
        MangaDexTurkish(),
        MangaDexIndonesian(),
        MangaDexSpanishLTAM(),
        MangaDexCatalan(),
        MangaDexHungarian(),
        MangaDexBulgarian(),
        MangaDexFilipino()
)