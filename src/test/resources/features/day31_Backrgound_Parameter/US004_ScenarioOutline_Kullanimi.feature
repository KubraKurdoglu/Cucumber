Feature: Google_Search
  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"googleUrl"_sayfasina_gider

    Scenario Outline: Google_Aramalazri
      * kullanici_cookiesi_kapatir
      * kullanici googleda "<aranacakKelime>" aratir
      * kullanici 2 saniye bekler
      * basligin "<aranacakKelime>" icerdigini dogrular
      * sayfayi_kapatir

      Examples:
        | aranacakKelime |
        | volvo          |
        | bmv            |
        | mercedes       |
        | audi           |
        | ford           |
        | renault        |