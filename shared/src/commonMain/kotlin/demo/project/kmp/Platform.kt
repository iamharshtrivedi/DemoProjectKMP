package demo.project.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform