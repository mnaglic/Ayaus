# ...And Yet Another URL Shortener

As if the world doesn't have enough of those already.

Anyway, this project was done as an exercise, just to get my feet wet with Clojure and Noir framework.

## What I used
[MongoDB](http://www.mongodb.org/) for persistence, [Monger](http://clojuremongodb.info/) for communication with MongoDB.

Server-side code is written in [Clojure](http://clojure.org/) using the awesome [Noir](http://webnoir.org/) framework.

HTML templating was done using [Hiccup](http://github.com/weavejester/hiccup), CSS taken from [Twitter Bootstrap](http://twitter.github.com/bootstrap/).

Client-side code is written in [ClojureScript](http://github.com/emezeske/clojurescript).

[Fetch](http://github.com/ibdknox/fetch) is used for client-server interaction, [Domina](http://github.com/levand/domina) for DOM manipulation.

## Usage

Get the source. Get [Leiningen](https://github.com/technomancy/leiningen/) if you don't already have it. Then, in the project folder:

    lein deps
    lein run

Go to http://localhost:8080.

## License

Copyright (C) 2012 Matej Naglić

Released as Public Domain. Do whatever you want with this code.

