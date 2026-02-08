# Java
# Practical work 05: JDBC
**Auteur :** Antonin DUMAS
**Email :** antonin.dumas@student.junia.com

## Description
Ce PW implémente une gestion de films et de genres via une base de données SQLite.

1.  **Bonus 1** :
    * Utilisation de `DriverManager` dans `DataSourceFactory`.
    * La dépendance `sqlite-jdbc` est en scope `runtime` dans le `pom.xml`.
    * Le code compile sans dépendance directe au driver SQLite.

2.  **Bonus 2** :
    * La méthode `GenreDao.getGenre(String name)` retourne un `Optional<Genre>` pour éviter les `NullPointerException`.