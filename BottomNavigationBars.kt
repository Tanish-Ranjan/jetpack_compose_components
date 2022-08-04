import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NavBar1(
    list: List<Int>,
    defaultSelectedIndex: Int = 0
) {

    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        color = Color.White
    ) {

        var selectedIndex by remember {
            mutableStateOf(defaultSelectedIndex)
        }

        Row(Modifier.fillMaxSize()) {

            list.forEachIndexed { index, icon ->

                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .clickable {
                            selectedIndex = index
                        },
                    contentAlignment = Center
                ) {
                    Icon(
                        painterResource(icon),
                        null,
                        Modifier.size(24.dp),
                        tint = if (selectedIndex == index) MaterialTheme.colorScheme.primary else Color.Gray
                    )
                }

            }

        }

    }

}

@Composable
fun NavBar2(
    list: List<Int>,
    defaultSelectedIndex: Int = 0
) {

    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        color = Color.White
    ) {

        var selectedIndex by remember {
            mutableStateOf(defaultSelectedIndex)
        }

        Row(Modifier.fillMaxSize()) {

            list.forEachIndexed { index, icon ->

                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f),
                    contentAlignment = Center
                ) {

                    Box(
                        Modifier
                            .size(40.dp)
                            .clickable {
                                selectedIndex = index
                            }
                            .background(
                                if (selectedIndex == index) MaterialTheme.colorScheme.primary
                                else Color.Transparent,
                                RoundedCornerShape(4.dp)
                            ),
                        contentAlignment = Center
                    ) {

                        Icon(
                            painterResource(icon),
                            null,
                            Modifier.size(24.dp),
                            tint = if (selectedIndex == index) Color.White else Color.Gray
                        )

                    }

                }

            }

        }

    }

}

@Composable
fun NavBar3(
    list: List<Int>,
    defaultSelectedIndex: Int = 0
) {

    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        color = Color.White
    ) {

        var selectedIndex by remember {
            mutableStateOf(defaultSelectedIndex)
        }

        Row(Modifier.fillMaxSize()) {

            list.forEachIndexed { index, icon ->

                val color = if (selectedIndex != index) Color.Transparent
                else MaterialTheme.colorScheme.primary

                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .clickable {
                            selectedIndex = index
                        }
                        .background(color),
                    contentAlignment = Center
                ) {

                    Icon(
                        painterResource(icon),
                        null,
                        Modifier.size(24.dp),
                        tint = if (selectedIndex == index) Color.White else Color.Gray
                    )

                }

            }

        }

    }

}

data class Nav(
    @DrawableRes val icon: Int,
    val title: String
)

@Composable
fun NavBar4(
    list: List<Nav>,
    defaultSelectedIndex: Int = 0
) {

    Surface(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        color = Color.White
    ) {

        var selectedIndex by remember {
            mutableStateOf(defaultSelectedIndex)
        }

        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ) {

            list.forEachIndexed { index, nav ->

                Box(
                    Modifier
                        .height(32.dp)
                        .clickable {
                            selectedIndex = index
                        }
                        .background(
                            if (selectedIndex == index) MaterialTheme.colorScheme.primary else Color.Transparent,
                            RoundedCornerShape(4.dp)
                        ),
                    contentAlignment = Center
                ) {

                    Row(
                        verticalAlignment = CenterVertically,
                        modifier = Modifier.padding(4.dp)
                    ) {

                        Icon(
                            painterResource(nav.icon),
                            null,
                            Modifier.size(24.dp),
                            tint = if (selectedIndex != index) Color.Gray else Color.White
                        )
                        AnimatedVisibility(selectedIndex == index) {
                            Text(
                                nav.title,
                                modifier = Modifier.padding(start = 8.dp),
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }

                    }

                }

            }

        }

    }

}

@Composable
fun NavBar5(
    list: List<Nav>,
    defaultSelectedIndex: Int = 0
) {

    Box(
        Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color.White, RoundedCornerShape(8.dp)),
    ) {

        var selectedIndex by remember {
            mutableStateOf(defaultSelectedIndex)
        }

        Row(
            verticalAlignment = CenterVertically,
            modifier = Modifier
                .fillMaxSize(),
        ) {

            list.forEachIndexed { index, nav ->

                Box(
                    Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .clickable {
                            selectedIndex = index
                        },
                    contentAlignment = Center
                ) {

                    Column(
                        if (selectedIndex == index)
                            Modifier.offset(y = (-8).dp)
                        else Modifier,
                        horizontalAlignment = CenterHorizontally,
                    ) {
                        Box(
                            Modifier
                                .background(
                                    if (selectedIndex == index) MaterialTheme.colorScheme.primary
                                    else Color.Transparent,
                                    CircleShape
                                )
                                .size(36.dp),
                            contentAlignment = Center
                        ) {
                            Icon(
                                painterResource(nav.icon),
                                null,
                                Modifier.size(24.dp),
                                tint = if (selectedIndex != index) Color.Gray else Color.White
                            )
                        }

                        AnimatedVisibility(selectedIndex == index) {
                            Text(
                                nav.title,
                                modifier = Modifier
                                    .padding(top = 4.dp),
                                color = Color.DarkGray,
                                fontSize = 12.sp
                            )
                        }
                    }

                }

            }

        }

    }

}
