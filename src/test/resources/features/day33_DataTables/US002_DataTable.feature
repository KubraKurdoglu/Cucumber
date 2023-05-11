Feature: US002_BlueRentalCar_Login_Islemi
  Scenario: TC01_BlueRentalCar_Positive_Test
    Given kullanici_"blueRentACarUrl"_sayfasina_gider
    Then Verilen_kullanicilar_ile_login_olunur
    |email|password|
    |sam.walker@bluerentalcars.com|c!fas_art|
    |kate.brown@bluerentalcars.com|tad1$Fas|

    And sayfayi_kapatir



    #yukardaki kodu her step icin ayri ayri da yapabiliriz, ama bir butun olarakda yapilabilir
  #asagida ikinci yol var
  # Then Verilen_kullanicilar_ile_login_olunur
  #    |email|password|
  #    |sam.walker@bluerentalcars.com|c!fas_art|
  #    And Verilen_kullanici_ile_login_olunur
  #    |email|password|
  #    |kate.brown@bluerentalcars.com|tad1$Fas|
  #    And sayfayi_kapatir
  #