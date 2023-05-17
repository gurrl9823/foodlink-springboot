# JRE (Java Runtime Environment) 버전을 사용합니다.
# JRE는 Java 애플리케이션을 실행하는 데 필요한 최소한의 구성 요소만 포함합니다.
# 개발 시 JRE만 필요한 경우에 유용합니다.
# 가벼운 이미지이며 실행환경에 최적화되어 있습니다.
FROM adoptopenjdk:11-jre-hotspot

# build/libs/ 디렉토리에 있는 모든 JAR 파일을 app.jar로 복사합니다.
COPY build/libs/*.jar app.jar

# java -jar app.jar 명령을 실행하도록 설정합니다.
ENTRYPOINT ["java", "-jar", "app.jar"]
