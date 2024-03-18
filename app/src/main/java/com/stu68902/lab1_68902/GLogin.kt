
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
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Glogin(){
    Surface (
        color =  Color.LightGray,
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
        )
        {
            TopPart_Glogin()
            LoginBox_Glogin()
            ButtonPart_Glogin()
            BottomPart_Glogin()
        }

    }
}

@Composable
fun TopPart_Glogin(){
    Spacer(modifier = Modifier.height(150.dp))
    Image(painter = painterResource(id = R.drawable.lock),
        contentDescription = "Lock for gLogin" ,
        modifier = Modifier.requiredSize(110.dp))

    Spacer(modifier = Modifier.height(5.dp))

    Text(text = "Welcome back you've been missed",
        fontSize = 15.sp,
        color = Gray
    )

}

@Composable
fun LoginBox_Glogin(){
    Box(modifier = Modifier
        .height(190.dp)
        .width(310.dp)
        .background(color = Color.LightGray)
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

            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
            ){
                Text(text = "Forgot Password ?",
                    fontSize = 15.sp,
                    color = Color.Gray,
                    modifier = Modifier.align(Alignment.CenterEnd)
                )

            }


        }
    }

}

@Composable
fun ButtonPart_Glogin() {

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

            Text("Login", fontSize = 20.sp)



        }

    }
    Text(text = "Or continue with",
        fontSize = 15.sp,
        color = Color.Gray
    )
}


@Composable
fun BottomPart_Glogin() {

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
            contentDescription = "Apple for GLogin",
            modifier = Modifier
                .requiredSize(70.dp)
                .padding(8.dp)
        )
    }

    Text(
        text = "Not a member?",
        color = Gray
    )
    Spacer(modifier = Modifier.width(5.dp))
    Text(
        text = "Register now", fontWeight = FontWeight.Bold, color = Gray,
        modifier = Modifier.padding(bottom = 50.dp)
    )

}

