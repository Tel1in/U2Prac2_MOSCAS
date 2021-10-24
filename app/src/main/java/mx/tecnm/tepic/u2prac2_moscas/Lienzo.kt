package mx.tecnm.tepic.u2prac2_moscas

import android.app.AlertDialog
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View


class Lienzo(p:MainActivity): View(p){
    var xTouch = 1240f
    var yTouch = 700f
    var puntero : Imagen ?= null //no tiene memoria

    var posX=0f
    var posY=0f

    var mos1 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos2 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos3 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos4 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos5 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos6 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos7 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos8 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos9 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos10 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos11 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos12 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos13 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos14 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos15 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos16 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos17 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos18 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos19 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos20 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos21 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos22 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos23 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos24 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos25 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos26 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos27 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos28 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos29 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos30 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos31 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos32 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos33 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos34 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos35 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos36 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos37 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos38 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos39 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos40 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)

    var mos41 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos42 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos43 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos44 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos45 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos46 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos47 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos48 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos49 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos50 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos51 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos52 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos53 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos54 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos55 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos56 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos57 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos58 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos59 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos60 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos61 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos62 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos63 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos64 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos65 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos66 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos67 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos68 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos69 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos70 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos71 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos72 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos73 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos74 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos75 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos76 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos77 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos78 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos79 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)
    var mos80 = Imagen(this,posX=(Math.random()*2000).toFloat(), posY=(Math.random()*800).toFloat(),R.drawable.mosca)




    var mancha = Imagen(this, 0f,0f,R.drawable.mancha)
    var trabajando= false
    var arregloM = arrayOf<Imagen>(mos1,mos2,mos3,mos4,mos5,mos6,mos7,mos8,mos9,mos10,
        mos11,mos12,mos13,mos14,mos15,mos16,mos17,mos18,mos19,mos20,
        mos21,mos22,mos23,mos24,mos25,mos26,mos27,mos28,mos29,mos30,
        mos31,mos32,mos33,mos34,mos35,mos36,mos37,mos38,mos39,mos40,
        mos41,mos42,mos43,mos44,mos45,mos46,mos47,mos48,mos49,mos50,
        mos51,mos52,mos53,mos54,mos55,mos56,mos57,mos58,mos59,mos60,
        mos61,mos62,mos63,mos64,mos65,mos66,mos67,mos68,mos69,mos70,
        mos71,mos72,mos73,mos74,mos75,mos76,mos77,mos78,mos79,mos80)

    var contadorTimer =0
    var contadorM = 0
    var tiempo = "0"

    val timer = object : CountDownTimer(60000,1000){
        override fun onFinish() {
            start()
            if(contadorTimer==60){
                if(contadorM==80){
                    AlertDialog.Builder(p).setTitle("FELICIDADES")
                        .setMessage("Mataste a todas las moscas")
                        .setPositiveButton("Oki"){d,i->d.dismiss()}.show()
                }else{
                    AlertDialog.Builder(p).setTitle("F")
                        .setMessage("Perdistes XD")
                        .setPositiveButton("Oki"){d,i->d.dismiss()}.show()
                }
            }
        }

        override fun onTick(millisUntilFinished: Long) {
            if(contadorTimer<60) {
                contadorTimer++
                tiempo = "Tiempo: $contadorTimer"
            }
            invalidate()
        }

    }
    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var p = Paint()
        c.drawColor(Color.WHITE)
        p.textSize = 50f
        c.drawText(tiempo, 0f, 59f, p)

        var mm = "Moscas: $contadorM"
        c.drawText(mm,540f,59f,p)
        arregloM[0].pintar(c)
        arregloM[1].pintar(c)
        arregloM[2].pintar(c)
        arregloM[3].pintar(c)
        arregloM[4].pintar(c)
        arregloM[5].pintar(c)
        arregloM[6].pintar(c)
        arregloM[7].pintar(c)
        arregloM[8].pintar(c)
        arregloM[9].pintar(c)
        arregloM[10].pintar(c)

        arregloM[11].pintar(c)
        arregloM[12].pintar(c)
        arregloM[13].pintar(c)
        arregloM[14].pintar(c)
        arregloM[15].pintar(c)
        arregloM[16].pintar(c)
        arregloM[17].pintar(c)
        arregloM[18].pintar(c)
        arregloM[19].pintar(c)
        arregloM[20].pintar(c)

        arregloM[21].pintar(c)
        arregloM[22].pintar(c)
        arregloM[23].pintar(c)
        arregloM[24].pintar(c)
        arregloM[25].pintar(c)
        arregloM[26].pintar(c)
        arregloM[27].pintar(c)
        arregloM[28].pintar(c)
        arregloM[29].pintar(c)
        arregloM[30].pintar(c)

        arregloM[31].pintar(c)
        arregloM[32].pintar(c)
        arregloM[33].pintar(c)
        arregloM[34].pintar(c)
        arregloM[35].pintar(c)
        arregloM[36].pintar(c)
        arregloM[37].pintar(c)
        arregloM[38].pintar(c)
        arregloM[39].pintar(c)
        arregloM[40].pintar(c)

        arregloM[41].pintar(c)
        arregloM[42].pintar(c)
        arregloM[43].pintar(c)
        arregloM[44].pintar(c)
        arregloM[45].pintar(c)
        arregloM[46].pintar(c)
        arregloM[47].pintar(c)
        arregloM[48].pintar(c)
        arregloM[49].pintar(c)
        arregloM[50].pintar(c)

        arregloM[51].pintar(c)
        arregloM[52].pintar(c)
        arregloM[53].pintar(c)
        arregloM[54].pintar(c)
        arregloM[55].pintar(c)
        arregloM[56].pintar(c)
        arregloM[57].pintar(c)
        arregloM[58].pintar(c)
        arregloM[59].pintar(c)
        arregloM[60].pintar(c)

        arregloM[61].pintar(c)
        arregloM[62].pintar(c)
        arregloM[63].pintar(c)
        arregloM[64].pintar(c)
        arregloM[65].pintar(c)
        arregloM[66].pintar(c)
        arregloM[67].pintar(c)
        arregloM[68].pintar(c)
        arregloM[69].pintar(c)
        arregloM[70].pintar(c)

        arregloM[71].pintar(c)
        arregloM[72].pintar(c)
        arregloM[73].pintar(c)
        arregloM[74].pintar(c)
        arregloM[75].pintar(c)
        arregloM[76].pintar(c)
        arregloM[77].pintar(c)
        arregloM[78].pintar(c)
        arregloM[79].pintar(c)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if(event.action == MotionEvent.ACTION_DOWN){
            xTouch = event.x
            yTouch = event.y
            if(contadorTimer<60 || contadorM==80) {
                if (mos1.estaEnArea(event.x, event.y) == true) {
                    puntero = mos1
                    mos1.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }

                if (mos2.estaEnArea(event.x, event.y) == true) {
                    puntero = mos2
                    mos2.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }

                if (mos3.estaEnArea(event.x, event.y) == true) {
                    puntero = mos3
                    mos3.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos4.estaEnArea(event.x, event.y) == true) {
                    puntero = mos4
                    mos4.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos5.estaEnArea(event.x, event.y) == true) {
                    puntero = mos5
                    mos5.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos6.estaEnArea(event.x, event.y) == true) {
                    puntero = mos6
                    mos6.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos7.estaEnArea(event.x, event.y) == true) {
                    puntero = mos7
                    mos7.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos8.estaEnArea(event.x, event.y) == true) {
                    puntero = mos8
                    mos8.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos9.estaEnArea(event.x, event.y) == true) {
                    puntero = mos9
                    mos9.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos10.estaEnArea(event.x, event.y) == true) {
                    puntero = mos10
                    mos10.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos11.estaEnArea(event.x, event.y) == true) {
                    puntero = mos11
                    mos11.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos12.estaEnArea(event.x, event.y) == true) {
                    puntero = mos12
                    mos12.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos13.estaEnArea(event.x, event.y) == true) {
                    puntero = mos13
                    mos13.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos14.estaEnArea(event.x, event.y) == true) {
                    puntero = mos14
                    mos14.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos15.estaEnArea(event.x, event.y) == true) {
                    puntero = mos15
                    mos15.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos16.estaEnArea(event.x, event.y) == true) {
                    puntero = mos16
                    mos16.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos17.estaEnArea(event.x, event.y) == true) {
                    puntero = mos17
                    mos17.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos18.estaEnArea(event.x, event.y) == true) {
                    puntero = mos18
                    mos18.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos19.estaEnArea(event.x, event.y) == true) {
                    puntero = mos19
                    mos19.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos20.estaEnArea(event.x, event.y) == true) {
                    puntero = mos20
                    mos20.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos21.estaEnArea(event.x, event.y) == true) {
                    puntero = mos21
                    mos21.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos22.estaEnArea(event.x, event.y) == true) {
                    puntero = mos22
                    mos22.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos23.estaEnArea(event.x, event.y) == true) {
                    puntero = mos23
                    mos23.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos24.estaEnArea(event.x, event.y) == true) {
                    puntero = mos24
                    mos24.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos25.estaEnArea(event.x, event.y) == true) {
                    puntero = mos25
                    mos25.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos26.estaEnArea(event.x, event.y) == true) {
                    puntero = mos26
                    mos26.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos27.estaEnArea(event.x, event.y) == true) {
                    puntero = mos27
                    mos27.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos28.estaEnArea(event.x, event.y) == true) {
                    puntero = mos28
                    mos28.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos29.estaEnArea(event.x, event.y) == true) {
                    puntero = mos29
                    mos29.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos30.estaEnArea(event.x, event.y) == true) {
                    puntero = mos30
                    mos30.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos31.estaEnArea(event.x, event.y) == true) {
                    puntero = mos31
                    mos31.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos32.estaEnArea(event.x, event.y) == true) {
                    puntero = mos32
                    mos32.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos33.estaEnArea(event.x, event.y) == true) {
                    puntero = mos33
                    mos33.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos34.estaEnArea(event.x, event.y) == true) {
                    puntero = mos34
                    mos34.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos35.estaEnArea(event.x, event.y) == true) {
                    puntero = mos35
                    mos35.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos36.estaEnArea(event.x, event.y) == true) {
                    puntero = mos36
                    mos36.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos37.estaEnArea(event.x, event.y) == true) {
                    puntero = mos37
                    mos37.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos38.estaEnArea(event.x, event.y) == true) {
                    puntero = mos38
                    mos38.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos39.estaEnArea(event.x, event.y) == true) {
                    puntero = mos39
                    mos39.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos40.estaEnArea(event.x, event.y) == true) {
                    puntero = mos40
                    mos40.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos41.estaEnArea(event.x, event.y) == true) {
                    puntero = mos41
                    mos41.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos42.estaEnArea(event.x, event.y) == true) {
                    puntero = mos42
                    mos42.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos43.estaEnArea(event.x, event.y) == true) {
                    puntero = mos43
                    mos43.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos44.estaEnArea(event.x, event.y) == true) {
                    puntero = mos44
                    mos44.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos45.estaEnArea(event.x, event.y) == true) {
                    puntero = mos45
                    mos45.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos46.estaEnArea(event.x, event.y) == true) {
                    puntero = mos46
                    mos46.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos47.estaEnArea(event.x, event.y) == true) {
                    puntero = mos47
                    mos47.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos48.estaEnArea(event.x, event.y) == true) {
                    puntero = mos48
                    mos48.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos49.estaEnArea(event.x, event.y) == true) {
                    puntero = mos49
                    mos49.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos50.estaEnArea(event.x, event.y) == true) {
                    puntero = mos50
                    mos50.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos51.estaEnArea(event.x, event.y) == true) {
                    puntero = mos51
                    mos51.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos52.estaEnArea(event.x, event.y) == true) {
                    puntero = mos52
                    mos52.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos53.estaEnArea(event.x, event.y) == true) {
                    puntero = mos53
                    mos53.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos54.estaEnArea(event.x, event.y) == true) {
                    puntero = mos54
                    mos54.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos55.estaEnArea(event.x, event.y) == true) {
                    puntero = mos55
                    mos55.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos56.estaEnArea(event.x, event.y) == true) {
                    puntero = mos56
                    mos56.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos57.estaEnArea(event.x, event.y) == true) {
                    puntero = mos57
                    mos57.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos58.estaEnArea(event.x, event.y) == true) {
                    puntero = mos58
                    mos58.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos59.estaEnArea(event.x, event.y) == true) {
                    puntero = mos59
                    mos59.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos60.estaEnArea(event.x, event.y) == true) {
                    puntero = mos60
                    mos60.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos61.estaEnArea(event.x, event.y) == true) {
                    puntero = mos61
                    mos61.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos62.estaEnArea(event.x, event.y) == true) {
                    puntero = mos62
                    mos62.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos63.estaEnArea(event.x, event.y) == true) {
                    puntero = mos63
                    mos63.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos64.estaEnArea(event.x, event.y) == true) {
                    puntero = mos64
                    mos64.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos65.estaEnArea(event.x, event.y) == true) {
                    puntero = mos65
                    mos65.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos66.estaEnArea(event.x, event.y) == true) {
                    puntero = mos66
                    mos66.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos67.estaEnArea(event.x, event.y) == true) {
                    puntero = mos67
                    mos67.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos68.estaEnArea(event.x, event.y) == true) {
                    puntero = mos68
                    mos68.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos69.estaEnArea(event.x, event.y) == true) {
                    puntero = mos69
                    mos69.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos70.estaEnArea(event.x, event.y) == true) {
                    puntero = mos70
                    mos70.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos71.estaEnArea(event.x, event.y) == true) {
                    puntero = mos71
                    mos71.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos72.estaEnArea(event.x, event.y) == true) {
                    puntero = mos72
                    mos72.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos73.estaEnArea(event.x, event.y) == true) {
                    puntero = mos73
                    mos73.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos74.estaEnArea(event.x, event.y) == true) {
                    puntero = mos74
                    mos74.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos75.estaEnArea(event.x, event.y) == true) {
                    puntero = mos75
                    mos75.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos76.estaEnArea(event.x, event.y) == true) {
                    puntero = mos76
                    mos76.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos77.estaEnArea(event.x, event.y) == true) {
                    puntero = mos77
                    mos77.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos78.estaEnArea(event.x, event.y) == true) {
                    puntero = mos78
                    mos78.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos79.estaEnArea(event.x, event.y) == true) {
                    puntero = mos79
                    mos79.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
                if (mos80.estaEnArea(event.x, event.y) == true) {
                    puntero = mos80
                    mos80.cambiarImagen(this, R.drawable.mancha)
                    contadorM++
                }
            }
        }
        if(event.action == MotionEvent.ACTION_MOVE){
            //SE ARRASTRA
            if(trabajando==false){
                timer.start()
                trabajando=true
            }
        }
        if(event.action == MotionEvent.ACTION_UP){
            //SE LIBERÓ
            puntero=null
        }

        invalidate()//vuelve a llamar al onDraw y lo repinta
        return true
    }//class fun onTouchEvent
}