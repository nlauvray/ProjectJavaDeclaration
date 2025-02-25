# 1. Nettoyer les anciens .class
find bin -name "*.class" -delete

# 2. Compiler tous les fichiers Java
javac -d bin src/banque/entites/*.java

# 3. Lancer le programme principal
java -cp bin banque.entites.TestBanque