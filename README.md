# AllegroTask
Repozytorium utworzone na potrzeby zadania rekrutacyjnego

Na potrzeby zadania rekrutacyjnego dla firmy Allegro zostały napisane testy dla metod REST API:
- GET IDs of Allegro categories
- GET a category by ID 
- GET parameters supported by a category

W teście wykorzystano dostępnie publicznie biblioteki:
- REST Assured - do wywołań metod REST API
- TestNG - Do utworzenia asercji dla każdego wywołania metody aby sprawdzić wynik aktualny z oczekiwanym
- Gson - Do deserializacji odpowiedzi z serwera

Testy są napisane i dostosowane do środowiska testowego Allegro, tj. Sandbox. 
W celu napisania została utworzona aplikacja na ww. środowisku testowym. Dane potrzebne do autoryzacji (uzyskania tokenu bearer) zostały umieszczone w zewnętrznym plliku 'configuration.properties'.
Utworzone zostały 2 klasy (BaseTest i TaskMethods). Klasa BaseTest zawiera metody które są wykonywane przed właściwym testem. Przed testem:
- Jest definiowany URL na którym są wywoływane metody
- Jest wywoływana metoda "auth/oauth/token" w celu uzyskania tokenu Bearer. Metoda koduje dane client-a w formacie Base64 i na podstawie odpowiedzi z serwera wyciagany jest token
- Są określone podstawowe header'y do użycia w metodach
- Jest definiowana oczekiwana odpowiedź serwera (200) wraz z czasem odpowiedzi (max 3 sekundy)
    
Klasa TaskMethods zawiera 3 testy, każdy test wywołuje jedną metodę. Po wywołaniu każdej metody jest przeprowadzana asercja aby zweryfikować odpowiedź serwera. 
Aby zweryfikować odpowiedź serwera zostały utworzone klasy w "src/main/java/org/allegro/pojo" w celu deserializacji odpowiedzi typu json. Dzięki temu możemy w łatwy sposób zweryfikować obiekty które zostały zawarte w odpowiedzi serwera. 
W przyszłości aplikację taką jak ta można łatwo rozbudować o operację CRUD. 
Metody "/sale/categories" i "/sale/categories/{categoryId}" zwracają listę obiektów, aplikacja deserializuje obiekty a następnie jest przeprowadzana asercja czy lista którą otrzymaliśmy nie jest pusta.
Metoda "/sale/categories/{categoryId}" zwraca jeden obiekt, wyciągany jest jeden atrybut z odpowiedzi i jest weryfikowana jego wartość z oczekiwaną.
Wartości oczekiwana zostały wzięte z dokumentacji pod adresem https://developer.allegro.pl/documentation/#tag/Categories-and-parameters 

Aby uruchomi test, należy
- Uruchomić interpreter poleceń (np. PowerShell, CMD, git Bash) w folderze "AllegroTask", lub uruchomić przejść do niniejszego folderu
- Wywołać metodę 'mvn clean test'

Po wywołaniu metody okno poinformuje o przebiegu testówq

