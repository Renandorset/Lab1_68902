import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stu68902.lab1_68902.R
import com.stu68902.lab1_68902.lightBlack
import com.stu68902.lab1_68902.lightGray


@Composable
fun BSignUp(){
    Surface (
        color =  Color.Black,
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        )
        {
            TopPart_BSignUp()
            MyLoginBox_BSignUp()
            ButtonPart_BSignUp()
            BottomPart_BSignUp()
        }

    }
}

@Composable
fun TopPart_BSignUp(){
    Spacer(modifier = Modifier.height(150.dp))
    Image(painter = painterResource(id = R.drawable.lock),
        contentDescription = "Lock for gLogin" ,
        modifier = Modifier.requiredSize(110.dp))

    Spacer(modifier = Modifier.height(5.dp))
    Text(text = "Let's create an account for you",
        fontSize = 15.sp,
        color = lightGray
    )
}

@Composable
fun MyLoginBox_BSignUp(){
    Box(modifier = Modifier
        .height(190.dp)
        .width(310.dp)
        .background(color = Color.Black)
    )
    {
        Column( modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TextField(value = "Email", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightBlack,
                    unfocusedTextColor = lightGray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = "Password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightBlack,
                    unfocusedTextColor = lightGray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = "Confirm password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightBlack,
                    unfocusedTextColor = lightGray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

        }
    }

}

@Composable
fun ButtonPart_BSignUp() {

    Row(
        modifier = Modifier
            .width(310.dp)
            .padding(bottom = 45.dp),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = lightBlack,
                contentColor = Color.White,
            )
        ) {

            Text("Sign Up", fontSize = 20.sp)
        }

    }

}

@Composable
fun BottomPart_BSignUp() {

    Box(
        modifier = Modifier
            .width(310.dp)
            .background(color = Color.Black)
    ) {
        Row(
            modifier = Modifier
                .padding(bottom = 30.dp)
                .align(Alignment.Center)

        ) {

            Text(
                text = "Already a member?",
                color = lightGray
            )
            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "Login Now", fontWeight = FontWeight.Bold, color = lightGray,
                modifier = Modifier.padding(bottom = 20.dp)
            )

        }
    }
}