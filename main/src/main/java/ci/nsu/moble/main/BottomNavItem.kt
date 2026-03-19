package ci.nsu.moble.main

sealed class BottomNavItem(
    val route: String,
    val title: String
) {
    data object Home : BottomNavItem("home", "Home")
    data object Profile : BottomNavItem("profile", "Profile")
    data object Settings : BottomNavItem("settings", "Settings")
}