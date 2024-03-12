package com.example.tugas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugas1.ui.theme.Tugas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Guys","Michael Ariel Manihuruk", 21,"Teknik Informatika", "5025201158", "PPB-I")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, nama: String, umur:Int, jurusan:String, nrp:String, kelas:String) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            fontWeight = FontWeight.Bold,
            color = Color.Green,
            lineHeight = 32.sp,
            fontSize = 30.sp,
            text = "Hello $name"
        )
        Text(
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "Nama saya $nama"
        )
        Text(
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "Umur saya sekarang $umur tahun"
        )
        Text(
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "Saya mahasiswa Departemen $jurusan"
        )
        Text(
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "Saya mahasiswa dengan NRP $nrp"
        )
        Text(
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            lineHeight = 32.sp,
            fontSize = 15.sp,
            text = "Saya salah satu mahasiswa dari kelas $kelas"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas1Theme {
        Greeting("Guys","Michael Ariel Manihuruk", 21,"Teknik Informatika", "5025201158", "PPB-I")
    }
}