# Paradoxe des Deux Enfants

Le paradoxe des deux enfants est un problème de théorie des probabilités évaluant le genre sexuel de deux enfants à partir d'une information sur l'un des deux. La qualification de ce problème comme paradoxe vient du fait que des **formulations équivalentes en apparence mènent à des résultats différents**.

![Stats](stats.jpg)


la problème initial se formule ainsi : 

>Sachant qu'une famille a deux enfants et que l'un d'eux est un garçon, quelle est la probabilité que l'autre soit un garçon aussi ?

6 scénario étudient ce paradoxe (qui est essentiellement le "cas 4" mais aussi "cas 5" si on lie les 2 cas) avec quelques variantes : 

## Cas 1: 

>On connait le premier enfant (**garçon**). Quelle est la probabilité que le second enfant soit aussi un **garçon**

**La probabilité démontrée est de 50%**

Naturellement c'est la réponse qu'on pourrait donner puisque d'une part les genres des enfants sont supposés indépendants d'un enfant à l'autre en l'absence d'hypothèse supplémentaire. D'autre part, chaque enfant peut être un garçon ou une fille de façon équiprobable.

## Cas 2: 
>On connait le premier enfant (**garcon né un mardi**). Quelle est la probabilité que le second enfant soit aussi un **garçon**.

**La probabilité démontrée est toujours de 50%**

Cette probabilité semble normale puisque le fait qu'il soit né un mardi ne change rien sur les probabilité du second enfant... Ouf !! 

## Cas 3: 
>On connait le premier enfant (**garçon né dans le finistère**). Quelle est la probabilité que le second enfant soit aussi un **garçon**.

**La probabilité démontrée est de 50%**

Idem, cette probabilité semble normale puisque le fait qu'il soit né dans le finistère ne change rien non plus sur les probabilité du second enfant... Jusqu'ici tout va bien ! 

## Cas 4: 
>On sait qu'**au moins un enfant est un garçon**. Quelle est la probabilité que le second enfant soit aussi un **garçon**.

**La probabilité démontrée est de 33%**

Naturellement on penserait qu’il n’y ait pas lieu que la probabilité change. C'est pourtant le cas !? **La manière dont est acquise l'information selon laquelle il y a au moins un garçon influence donc le résultat.** Le paradoxe ici est impressionant !


## Cas 5: 
>On sait qu'**au moins un enfant est un garçon né un mardi**. Quelle est la probabilité que le second enfant soit aussi un **garçon**.

**La probabilité démontrée est de 48%**

Naturellement si ce cas était la première question qui nous était posée on aurait tendance à répondre 1/2 puisqu'a priori ca semble être la même chose que le cas 1 bien que le terme "au moins" laisse subodorer quelques astuces tordues pour ceux qui ont fait un peu de stats à l'école. On ne serait de ce fait pas très loin de la bonne réponse bien que ce n'est pas tout à fait cela puisque la probabilité est effectivement de 13/27 (48%).

Si par contre on a connaissance du cas N°4 alors là le paradoxe frappe à nouveau. Pourquoi ne donne-t-il pas la même chose à savoir 1/3 !?!? Comment cette information du mardi peut elle avoir la moindre influence !?!?

## Cas 6: 
>On sait qu'**au moins un enfant est un garçon né dans le finistère**. Quelle est la probabilité que le second enfant soit aussi un **garçon**.

**La probabilité démontrée est de 50%**

On s'attendrait à avoir la même chose qu'au cas précédent mais encore une fois ce n'est pas le cas puisqu'on a à nouveau 1/2 au lieu de 13/27. Il semble que l'impact du mardi (proba 1/7) impacte plus la probabilité globale que celui du département (proba 1/99)... Point à creuser...

# Code Source

Le code source est très simple et est composé de deux classes: 

## Tirage
La classe [Tirage.java](https://github.com/mallenou/2enfants/blob/main/src/Tirage.java) tire de manière aléatoire un tirage de 2 enfants. 


## Stats
La classe [Stats.java](https://github.com/mallenou/2enfants/blob/main/src/Stats.java) simule indépendamment les scénario décrits ci-dessus. 
