package fr.paita.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform