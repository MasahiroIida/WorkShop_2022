# SpringBootTemplateRepository

## ライブラリ

サーバ側

- Java 1.8
- org.springframework.boot 2.2.6
  - spring-boot-starter
  - spring-boot-starter-test
  - spring-boot-starter-web
  - spring-boot-starter-security
- org.projectlombok
  - lombok

フロント側

- node v10.16.3
  - npm  
    使用ライブラリは`package.json` 参照。
    別プロジェクトのものをベースにしたため、不要なライブラリ群が含まれている。必要に応じて削除すること。

## User Guide

### プロジェクト内容

SpringBoot でアプリケーション開発する上で必要となる地盤を提供する。

- サーバ側
  - Maven ビルド設定
  - Spring Security による認証・認可処理
  - サンプルコード
- フロント側
  - npm 設定
  - webpack 設定
  - サンプルコード

### 開発環境

サーバ側は Eclipse、フロント側は VSCode で開発。

#### 開発環境(サーバ側)

プロジェクトは Maven プロジェクトのため、インポートする場合は`Existing Maven Projects` でインポート可能。

- ローカル環境でのプロセス起動方法  
  SpringBoot アプリケーションで`MainApplication.java` を実行すればサーバプロセスが起動する。
- ビルド方法  
  Maven ビルドで jar が生成可能。  
  ルートディレクトリで`mvn clean package` を実行すると、target 配下に jar が生成される。  
  ビルドの中でフロント側もビルドして jar 内に組み込んでいる。

#### 開発環境(フロント側)

`src/main/frontend` 配下がワークスペース。  
npm でパッケージ管理しているため、最初に`npm install`を実行すること。  
webpack の devServer で使って、開発しながら動作確認することが可能。
devServer を起動する場合、`npm run start` で起動する。  
起動後は`http://localhost:20100/` でアクセス出来る。
ただし devServer に Proxy を入れていないため、サーバにリクエスト処理をする場合には Proxy を入れるか、CORS 制約を無効化したブラウザでアクセスすること。

### デモ動作

開発時の動作確認方法を記載する。

- Eclipse でサーバ側アプリを起動
- `npm run start` でフロント側の devServer を起動
- CORS 制約を回避したブラウザで`http://localhost:20100/` にアクセス
- 社員番号：`123456` 、パスワード：`password` でログイン可能

### Tips

- CORS 制約回避のブラウザを起動する方法  
  `https://qiita.com/shika-e/items/808ccdd047133315b95c`
