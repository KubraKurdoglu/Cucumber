Feature:US001_Google_Search
  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"googleUrl"_sayfasina_gider


  Scenario Outline: Google_Aramalari
    * kullanici_cookiesi_kapatir
    * kullanici 2 saniye bekler
    * kullanici googleda "<aranacakKelime>" aratacaktir
    * kullanici 2 saniye bekler
    * basligin "<aranacakKelime>" icerdigini dogrulayacaktir
    * kullanici 2 saniye bekler
    * sayfayi_kapatir
    Examples:
      | aranacakKelime |
      | arac1          |
      | arac2          |
      | arac3          |
      | arac4          |
      | arac5          |
