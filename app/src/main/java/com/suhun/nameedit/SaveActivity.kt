package com.suhun.nameedit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suhun.nameedit.databinding.ActivitySaveBinding

class SaveActivity : AppCompatActivity() {
    lateinit var binding:ActivitySaveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaveBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val name:String? = intent.getStringExtra("NAME")
//        val name:String = intent.getStringExtra("NAME")!!
        var name:String = intent.getStringExtra("NAME") ?:"" //一載入SaveActivity的時候把intent送來的資料讀出
        binding.nameModify.setText(name) //把讀出的資料放入layout裡面modify_name的textView
        binding.saveButton.setOnClickListener {
            name = binding.nameModify.text.toString()//如果使用者按儲存按鈕，把modify_name的目前的內容text拿出來
            intent.putExtra("NAME", name)//存到intent裡面
            setResult(RESULT_OK, intent)
            finish()
        }
        binding.cancelButton.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}