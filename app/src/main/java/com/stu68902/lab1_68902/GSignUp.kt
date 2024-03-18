package com.stu68902.lab1_68902

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

@Composable
fun GSignUp(){
    Surface (
        color =  lightGray,
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        )
        {
            TopPart_GSignUp()
            LoginBox_GSignUp()
            ButtonPart_GSignUp()
            BottomPart_GSignUp()
        }

    }
}

@Composable
fun TopPart_GSignUp(){
    Spacer(modifier = Modifier.height(150.dp))
    Image(painter = painterResource(id = R.drawable.lock),
        contentDescription = "Lock for gLogin" ,
        modifier = Modifier.requiredSize(110.dp))

    Spacer(modifier = Modifier.height(5.dp))

    Text(text = "Let's create an account for you",
        fontSize = 15.sp,
        color = Color.Gray
    )
}

@Composable
fun LoginBox_GSignUp(){
    Box(modifier = Modifier
        .height(190.dp)
        .width(310.dp)
        .background(color = lightGray)
    )
    {
        Column( modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TextField(value = "Email", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = White,
                    unfocusedTextColor = Color.Gray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = "Password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = White,
                    unfocusedTextColor = Color.Gray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = "Confirm password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = White,
                    unfocusedTextColor = Color.Gray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

        }
    }

}

@Composable
fun ButtonPart_GSignUp() {

    Row(
        modifier = Modifier
            .width(310.dp)
            .padding(bottom = 45.dp),
    ) {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .weight(1f),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = White,
                contentColor = Color.Black,
            )
        ) {

            Text("Sign Up", fontSize = 20.sp)
        }

    }

}

@Composable
fun BottomPart_GSignUp() {



            Text(
                text = "Already a member?",
                color = Color.Gray
            )
            Spacer(modifier = Modifier.width(5.dp))

            Text(
                text = "Login Now", fontWeight = FontWeight.Bold, color = Color.Gray,
                modifier = Modifier.padding(bottom = 20.dp)
            )

        }
