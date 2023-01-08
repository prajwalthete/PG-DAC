FROM maven
WORKDIR myapp
COPY . .
RUN mvn compile
CMD mvn exec:java -Dexec.mainClass=com.cdac.PdfWriteExample