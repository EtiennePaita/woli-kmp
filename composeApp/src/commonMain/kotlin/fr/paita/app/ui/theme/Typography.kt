package fr.paita.app.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import org.jetbrains.compose.resources.Font
import woli_kmp.composeapp.generated.resources.Res
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import woli_kmp.composeapp.generated.resources.Barlow_Bold
import woli_kmp.composeapp.generated.resources.Barlow_BoldItalic
import woli_kmp.composeapp.generated.resources.Barlow_ExtraBold
import woli_kmp.composeapp.generated.resources.Barlow_ExtraBoldItalic
import woli_kmp.composeapp.generated.resources.Barlow_Italic
import woli_kmp.composeapp.generated.resources.Barlow_Medium
import woli_kmp.composeapp.generated.resources.Barlow_MediumItalic
import woli_kmp.composeapp.generated.resources.Barlow_Regular
import woli_kmp.composeapp.generated.resources.Barlow_SemiBold
import woli_kmp.composeapp.generated.resources.Barlow_SemiBoldItalic


val extraSmallFontSize = 12.sp
val smallFontSize = 14.sp
val mediumFontSize = 18.sp
val largeFontSize = 24.sp
val extraLargeFontSize = 32.sp

@Composable
fun WiloTypography(): Typography {

    val barlow = FontFamily(
        Font(Res.font.Barlow_Regular, FontWeight.Normal, FontStyle.Normal),
        Font(Res.font.Barlow_Italic, FontWeight.Normal, FontStyle.Italic),

        Font(Res.font.Barlow_Bold, FontWeight.Bold, FontStyle.Normal),
        Font(Res.font.Barlow_BoldItalic, FontWeight.Bold, FontStyle.Italic),

        Font(Res.font.Barlow_Medium, FontWeight.Medium, FontStyle.Normal),
        Font(Res.font.Barlow_MediumItalic, FontWeight.Medium, FontStyle.Italic),

        Font(Res.font.Barlow_SemiBold, FontWeight.SemiBold, FontStyle.Normal),
        Font(Res.font.Barlow_SemiBoldItalic, FontWeight.SemiBold, FontStyle.Italic),

        Font(Res.font.Barlow_ExtraBold, FontWeight.ExtraBold, FontStyle.Normal),
        Font(Res.font.Barlow_ExtraBoldItalic, FontWeight.ExtraBold, FontStyle.Italic),
    )

    return Typography(
        headlineLarge = TextStyle(
            fontFamily = barlow,
            fontWeight = FontWeight.Bold,
            fontSize = extraLargeFontSize
        ),
        headlineMedium = TextStyle(
            fontFamily = barlow,
            fontWeight = FontWeight.SemiBold,
            fontSize = largeFontSize
        ),
        bodyMedium = TextStyle(
            fontFamily = barlow,
            fontWeight = FontWeight.Normal,
            fontSize = mediumFontSize
        ),
        bodyLarge = TextStyle(
            fontFamily = barlow,
            fontWeight = FontWeight.Medium,
            fontSize = largeFontSize
        ),
        displaySmall = TextStyle(
            fontFamily = barlow,
            fontWeight = FontWeight.Medium,
            fontSize = mediumFontSize
        ),
        labelMedium = TextStyle(
            fontFamily = barlow,
            fontWeight = FontWeight.Normal,
            fontSize = mediumFontSize
        ),
        labelSmall = TextStyle(
            fontFamily = barlow,
            fontWeight = FontWeight.Normal,
            fontSize = smallFontSize
        ),

    )
}