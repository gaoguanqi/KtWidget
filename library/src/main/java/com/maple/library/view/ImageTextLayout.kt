package com.maple.library.view

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.maple.library.R
import kotlinx.android.synthetic.main.layout_image_text.view.*

/**
 *  左图标 右文本 控件
 */
class ImageTextLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {



    init {

        val view: View = LayoutInflater.from(context).inflate(R.layout.layout_image_text,null)

        val tvText:TextView = view.tv_text
        val ivIcon:ImageView = view.iv_icon
        val array: TypedArray = context.obtainStyledAttributes(attrs, R.styleable.ImageTextLayout)
        val textColor = array?.getColor(R.styleable.ImageTextLayout_textColor,0)
        val textContent = array?.getString(R.styleable.ImageTextLayout_textContent)
        val textSize = array?.getDimension(R.styleable.ImageTextLayout_textSize,14.0f)
        val imageIcon = array?.getDrawable(R.styleable.ImageTextLayout_imageIcon)
        tvText.setTextColor(textColor)
        tvText.text = textContent
        tvText.textSize = textSize
        ivIcon.background = imageIcon
    }
}