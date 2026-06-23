package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Blurb() {
    P {
        Text(
            """Hey, my name's Nathan! I'm an Android Developer in the DMV area. I love spending time 
                |with my four cats, visiting national parks, and ordering a cortado at every coffee shop.""".trimMargin(),
        )
    }
}
