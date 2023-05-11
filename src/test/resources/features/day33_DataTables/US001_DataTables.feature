Feature: US001_Amazonda_Urun_Aratma
  Scenario: TC01_Amazonda_Urun_Aratma
    Given kullanici_amazon_sayfasina_gider
    And kullanici_verilen_urunleri_aratir
    |Urunler|
    |Samsung|
    |Nokia|
    |Iphone|
    |Urunler|
    |motorola|

  #burada Scenario outline kullanmadigi icin "Examples" yapisi kullanmadik.
  #ScenarioOutline yapisi daha rahattir, fakat bu yapiyi da gormemizi istedi hoca
  #cunku bu yapi da kullaniliyor.


  #DataTable; scenario'lardaki satır ve sütun için bir veri tablosu temsil eder.
#Bunun için kullanılmak istenen her stepten sonra yukarıdaki örnekteki bir tablo yapısı oluştururuz.
#ve bu stepin methodunu stepDefinition'da oluşturduğumuz zaman buradaki verileri alabilmemiz için
#oluşturulan methoda DataTable parametresi eklenir.
#Bu parametre ismi ile bir list oluşturulabilir.
#yada direkt asList() methodu ile row'lara ulaşabiliriz.

