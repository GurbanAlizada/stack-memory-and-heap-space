# Stack Memory And Heap Space

# Stack nədir ?

Stackdaşı, işləmə zamanı hər bir başlığa ayrılmış fiziki bir yerdir (RAM-da). Bir mövzu yaratdıqda yaradılır. Yığında yaddaşın idarə edilməsi LIFO (Son Giriş İlk Çıxış) sırasına uyğundur, çünki o, qlobal olaraq əlçatandır. O, dəyişənləri, obyektlərə istinadları və qismən nəticələri saxlayır. Stek üçün ayrılmış yaddaş funksiya geri qayıdana qədər yaşayır. Yeni obyektlərin yaradılması üçün yer yoxdursa, o, java.lang.StackOverFlowError-u atır. Elementlərin əhatə dairəsi onların ipləri ilə məhdudlaşır. JVM hər mövzu üçün ayrıca yığın yaradır.
