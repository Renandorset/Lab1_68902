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
fun Blogin(){
    Surface (
        color =  Color.Black,
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        )
        {
            TopPart()
            MyLoginBox()
            ButtonPart()
            BottomPart()
        }

    }
}

@Composable
fun TopPart(){
    Spacer(modifier = Modifier.height(150.dp))
    Image(painter = painterResource(id = R.drawable.lock),
        contentDescription = "Lock for gLogin" ,
        modifier = Modifier.requiredSize(110.dp))

    Spacer(modifier = Modifier.height(5.dp))

    Text(text = "Welcome back you've been missed",
        fontSize = 15.sp,
        color = Color.LightGray
    )
}

@Composable
fun MyLoginBox(){
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
                    unfocusedTextColor = Color.Gray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            TextField(value = "Password", onValueChange = {},
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = lightBlack,
                    unfocusedTextColor = Color.Gray,
                    focusedContainerColor = Color.Black),
                modifier = Modifier.fillMaxWidth())

            Spacer(modifier = Modifier.height(10.dp))

            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
            ){
                Text(text = "Forgot Password ?",
                fontSize = 15.sp,
                color = Color.LightGray,
                modifier = Modifier.align(Alignment.CenterEnd)
            )

            }





        }
    }

}

@Composable
fun ButtonPart() {

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

            Text("Login", fontSize = 20.sp)



        }

    }
    Text(text = "Or continue with",
        fontSize = 15.sp,
        color = Color.LightGray
    )
}


@Composable
fun BottomPart() {

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly
    )
    {
        Image(
            painter = painterResource(id = R.drawable.google),
            contentDescription = "Google for gLogin",
            modifier = Modifier
                .requiredSize(70.dp)
                .padding(5.dp),
        )

        Image(
            painter = painterResource(id = R.drawable.apple),
            contentDescription = "Apple for BLogin",
            modifier = Modifier
                .requiredSize(70.dp)
                .padding(8.dp)
        )
    }

            Text(
                text = "Not a member?",
                color = Color.LightGray
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "Register now", fontWeight = FontWeight.Bold, color = lightGray,
                modifier = Modifier.padding(bottom = 50.dp)
            )

        }

