# Stack Memory And Heap Space

Java-da yaddaşın idarə edilməsi mühüm prosesdir. Java tərəfindən avtomatik idarə olunur. JVM yaddaşı iki hissəyə bölür: Stack yaddaşı və Heap yaddaş. Java baxımından hər ikisi vacib yaddaş sahələridir, lakin hər ikisi fərqli məqsədlər üçün istifadə olunur. Stack yaddaşı ilə Heap yaddaşı arasındakı əsas fərq ondan ibarətdir ki, Stack yaddaşı obyektləri saxlayır və dinamik yaddaşın ayrılması və boşaldılmasından istifadə edərkən, Heap metodun icrası qaydasını və local dəyişənləri saxlamaq üçün istifadə olunur.

# Stack nədir ?

Stack yaddaşı, işləmə zamanı hər bir thread üçün ayrılmış fiziki bir yerdir (RAM-da). Bir thread yarandıqda eyni zamanda stack də yaradılır. Stack-də yaddaşın idarə edilməsi LIFO  prinsipinə uyğundur . O, dəyişənləri(int , long , boolean , char , byte , double , float) , method-ları və obyekt reference-larını saxlayır. Stack üçün ayrılmış yaddaş funksiya geri qayıdana qədər yaşayır. Yəni obyektlərin yaradılması üçün yer yoxdursa, o, java.lang.StackOverFlowError-u atır.  JVM hər thread üçün ayrıca stack yaradır.

Note : Statik dəyişənin yaddaşı proqramın başlanğıcında stack əvəzinə adi yaddaşda (proqram üçün xüsusi olaraq ayrılmış yaddaş) ayrılır. Bunun üstünlüyü ondan ibarətdir ki, dəyişən və ya prosedurunuzu tamamilə sabit edir və siz təsadüfən dəyəri dəyişə bilməzsiniz.

![img_1.png](photos2/img_1.png)

# Heap nədir ?

JVM işə salındıqda yaradılır və proqram işlədiyi müddətdə tətbiq tərəfindən istifadə olunur. Obyektləri və JRE siniflərini saxlayır. Hər dəfə biz obyektlər yaratsaq, o, Heap yaddaşında yer tutur, həmin obyektin reference-ı isə stack-də yaradır. O, stack kimi heç bir sıraya əməl etmir. O, yaddaş bloklarını dinamik şəkildə idarə edir. Bu o deməkdir ki, yaddaşı əl ilə idarə etmək lazım deyil. Yaddaşı avtomatik idarə etmək üçün Java artıq istifadə olunmayan obyektləri silən Garbage Collector-u təmin edir. Heap üçün ayrılmış yaddaş hər hansı bir hadisəyə, ya proqram dayandırılana, ya da yaddaş boş qalana qədər yaşayır. Bu, bütün thread-lərlə paylaşılan ümumi yaddaş sahəsidir. Heap sahəsi doludursa, java.lang.OutOfMemoryError-u atır.

![img.png](photos2/img.png)

# Data Types

![img_2.png](photos2/img_2.png)

Bu dəyişən tiplərinin stack/heap yerləşmələri tamamilə fərqlidir :

+ Primitive type-lar yəni dəyər tiplər yalnız RAM-ın Stack hissəsində tutulur .
+ Reference type-ların isə stack hissəsində reference-ı heap hissəsində isə obyekti yaranır (aşağıda nümunə və sxemlər ilə ətraflı izah olunub)


Primitive types :
+ Nümunə 1 :
![img_5.png](photos2/img_5.png)
OUTPUT : 56

![img_6.png](photos2/img_6.png)

Şəkildən göründüyü kimi burada sayi1-in qiyməti sayi2-in qiymətinə bərabərdir .
Dəyərlərin dəyişdirilməsi aparılır ancaq bağlantı qalmır . 


+ Nümunə 2 :
![img_3.png](photos2/img_3.png)
![img_4.png](photos2/img_4.png)
![img_7.png](photos2/img_7.png)

Göründüyü kimi burada method-a dəyərimizin adresini(reference-nı) yox dəyərimizin kopyasını göndərdik . Dəyişiklikdə yalnız kopya üzərində baş verir və  main-in içindəki number eyni qalır . 
Bu qayda digər primitive type-lar(byte , short , long , char , boolean , float , double) üçündə eynidir yəni RAM-da yalnız stack hissəsində var olurlar .

Data type-ların yaddaşda tutduğu yer : 
![img_8.png](photos2/img_8.png)

Note : String Value type (Primitive type) deyil ! String char array-indən ibarət olduğundan yaddaşda simvollarının sayının 2 misli qədər yer tutur . Boş string yəni new String("") yaddaşda 20 bit yer saxlıyır

# String 

String reference type olsada arxa planda işləmə şəkli olaraq primitive type kimi çalışır . Bu 5.nəsil proqramlaşdırma dillərində String-ə özəl istisna bir vəzyətdir . 

+ Nümunə 1 : 
![img_11.png](photos2/img_11.png)
![img_12.png](photos2/img_12.png)
![img_13.png](photos2/img_13.png)

Yəni burada sehir1-in qiyməti sehir2-in qiymətinə bərabərdir . Reference bərabərliyindən söhbət gedə bilməz . Qiymət mənimsədilməsi aparılır amma dəyişənlər arasında bağlantı qalmır . 

Sxemden göründüyu kimi String-ə yeni bir dəyər verdikdə o yaddaşda yeni bir yer açır yəni əvvəlki dəyəri dəyişib üstünə yazmır .
O əvvəlki dəyərin olduğu hissəni isə GC təmizliyir . Bizim nümunəmizdə isə hemin yeri göstərən bir reference var deyə silinmir
![img_14.png](photos2/img_14.png)
Buda String-in iş prinsipinə aid digər nümunədir




+ Nümunə 2 : 
![img_9.png](photos2/img_9.png)
![img_10.png](photos2/img_10.png)
![img_15.png](photos2/img_15.png)

Həmçinin buradada methoda string-in özü yox kopyası gönderilir . Buna görədə dəyişiklik yalnız həmin kopya üzərində gedir .



+ String Pool nədir ? 


String-lər new keyword-ü ilə yazıldıqda her bir string üçün heap-de fərqli yerləri tutur (yəni obyektlər yaradır) . Ancaq reference verib "" ilə qiymət versək və bu qiymətlər birdən çox olsa hamısı eyni yeri göstərəcək .

+ Nümunə
![img_16.png](photos2/img_16.png)
![img_17.png](photos2/img_17.png)
![img_18.png](photos2/img_18.png)
 

# Integer

+ Nümunə 1 :

![img_19.png](photos2/img_19.png)
+ Nümunə 2 :

![img_22.png](photos3/img_22.png)
![img_21.png](photos3/img_21.png)

# Arrays

Array-lər reference type-dır . 

+ Nümunə 1 :
![img_25.png](photos3/img_25.png)
![img_26.png](photos3/img_26.png)

Burada sayialar1-in adresi sayilar2-in adresine bərabər olur . Yəni bu bərabərlikdən sonrada bunlar arasında bağlantı qalır . Buna görədə bir reference-ı dəyişdikdə digəridə bundan təsirlənir . Heap-dəki 101 xanası isə onu tutan reference olmadığından GC tərəfindən silinir . 

+ Nümunə 2 :
![img_23.png](photos3/img_23.png)
![img_24.png](photos3/img_24.png)

Eyni proses burada da baş  verir . Array-in reference type olduğunu buradanda gördük .

#  Classes

Class-lar reference type sayılır.

+ Nümunə 1 :
![img_27.png](photos3/img_27.png)
+ OUTPUT : limon
![img_28.png](photos3/img_28.png)
Bu nümunədə user1-in adresi user2-in adresine bərabər olur . Bu bərabərlikdən sonra bağlandı qalır . Yəni həm user1 həmdə user2 eyni yeri göstərir. Heap-dəki 111 ünvanını göstərən heç bir reference olmadığından GC onu təmizliyir .


+ Nümunə 2 : 
![img_29.png](photos3/img_29.png)
![img_30.png](photos3/img_30.png)
![img_31.png](photos3/img_31.png)

Yəni burada method içində user-ın kopyası üzərində aparılan hər dəyişiklik user-a da təsir edəcək .

# Java pass by value 






# Garbage Collector