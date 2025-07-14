How to make a release
=====================

* Configure env variables

  ```
  OSSRH_USERNAME
  OSSRH_TOKEN
  OSSRH_KEYNAME
  ```

* Run the following command to deploy the artifact:

  ```
  mvn -s settings.xml release:clean release:prepare release:perform -Darguments="-s settings.xml"
  ```

* After successful deployment, push the changes out:

  ```
  git push
  ````
