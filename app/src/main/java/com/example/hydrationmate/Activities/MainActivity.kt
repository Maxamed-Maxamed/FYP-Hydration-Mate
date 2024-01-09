package com.example.hydrationmate.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hydrationmate.R


class MainActivity : AppCompatActivity() {

   /**
    * The onCreate function is called when the activity is being created and sets the content view to
    * the activity_main layout.
    */

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       // Function to open SecondActivity when the button is clicked
//       findViewById<View>(R.id.button).setOnClickListener {
//           val intent = Intent(this, SecondActivity::class.java)
//           startActivity(intent)
//       }

    }


}

