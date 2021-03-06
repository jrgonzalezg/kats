package com.github.mttkay.kats.data.option

import com.github.mttkay.kats.SemigroupK

object OptionSemigroupK : SemigroupK<Option.F> {
  override fun <A> combineK(fa1: OptionKind<A>, fa2: OptionKind<A>): Option<A> {
    val left = fa1.narrowOption()
    val right = fa2.narrowOption()
    return left.orElse { right }
  }
}
